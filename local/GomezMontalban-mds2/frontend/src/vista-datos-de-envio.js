import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaDatosDeEnvio extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%;">
 <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center; justify-content: center; flex-shrink: 0; margin: var(--lumo-space-m);">
  <h1>Datos de envío</h1>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-items: center; align-self: center; flex-shrink: 0; justify-content: center; margin: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); align-self: center; flex-shrink: 0; align-items: center; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
    <vaadin-vertical-layout theme="spacing">
     <vaadin-vertical-layout theme="spacing">
      <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m); flex-shrink: 0;">
       <vaadin-horizontal-layout theme="spacing">
        <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
         <label>ID Usuario</label>
        </vaadin-horizontal-layout>
        <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
         <vaadin-combo-box></vaadin-combo-box>
        </vaadin-horizontal-layout>
       </vaadin-horizontal-layout>
      </vaadin-vertical-layout>
      <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
       <vaadin-horizontal-layout theme="spacing">
        <vaadin-horizontal-layout theme="spacing">
         <label style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);">Nombre</label>
        </vaadin-horizontal-layout>
        <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m);">
         <vaadin-text-field></vaadin-text-field>
        </vaadin-horizontal-layout>
       </vaadin-horizontal-layout>
      </vaadin-vertical-layout>
      <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); align-self: center; align-items: center; justify-content: center; flex-shrink: 0;">
       <vaadin-horizontal-layout theme="spacing">
        <vaadin-horizontal-layout theme="spacing">
         <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); align-self: center; flex-shrink: 0; align-items: center; justify-content: center;">
          <label>Apellidos</label>
         </vaadin-horizontal-layout>
         <vaadin-horizontal-layout theme="spacing">
          <vaadin-text-field style="flex-shrink: 0; margin: var(--lumo-space-m);"></vaadin-text-field>
         </vaadin-horizontal-layout>
        </vaadin-horizontal-layout>
       </vaadin-horizontal-layout>
      </vaadin-vertical-layout>
      <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
       <vaadin-horizontal-layout theme="spacing">
        <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
         <label>Dirección</label>
        </vaadin-horizontal-layout>
        <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m);">
         <vaadin-text-field></vaadin-text-field>
        </vaadin-horizontal-layout>
       </vaadin-horizontal-layout>
      </vaadin-vertical-layout>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); align-self: center; align-items: center; justify-content: center; flex-shrink: 0;">
      <vaadin-horizontal-layout theme="spacing">
       <vaadin-horizontal-layout theme="spacing">
        <label style="margin: var(--lumo-space-m); align-self: center;">Localidad</label>
       </vaadin-horizontal-layout>
       <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
        <vaadin-text-field></vaadin-text-field>
       </vaadin-horizontal-layout>
      </vaadin-horizontal-layout>
     </vaadin-vertical-layout>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-vertical-layout theme="spacing">
     <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; margin: var(--lumo-space-m); align-self: center; align-items: center; justify-content: center;">
      <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
       <label style="margin: var(--lumo-space-m); align-self: center; flex-shrink: 0;">Código postal</label>
      </vaadin-horizontal-layout>
      <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
       <vaadin-text-field style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);"></vaadin-text-field>
      </vaadin-horizontal-layout>
     </vaadin-horizontal-layout>
     <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-items: center; justify-content: center; align-self: center; margin: var(--lumo-space-m);">
      <vaadin-horizontal-layout theme="spacing">
       <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
        <label style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;">Portal</label>
       </vaadin-horizontal-layout>
       <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-items: center; justify-content: center; align-self: center;">
        <vaadin-text-field style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;"></vaadin-text-field>
       </vaadin-horizontal-layout>
      </vaadin-horizontal-layout>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); align-self: center; flex-shrink: 0; align-items: center; justify-content: center;">
      <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
       <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
        <label style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);">Provincia</label>
       </vaadin-horizontal-layout>
       <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
        <vaadin-text-field style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;"></vaadin-text-field>
       </vaadin-horizontal-layout>
      </vaadin-horizontal-layout>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
      <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
       <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
        <label style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;">Calle</label>
       </vaadin-horizontal-layout>
       <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); align-self: center; align-items: center; justify-content: center;">
        <vaadin-text-field style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;"></vaadin-text-field>
       </vaadin-horizontal-layout>
      </vaadin-horizontal-layout>
     </vaadin-vertical-layout>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-datos-de-envio';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaDatosDeEnvio.is, VistaDatosDeEnvio);
