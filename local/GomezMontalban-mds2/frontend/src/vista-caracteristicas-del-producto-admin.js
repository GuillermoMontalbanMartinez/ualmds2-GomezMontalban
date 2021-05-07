import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

class VistaCaracteristicasDelProductoAdmin extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%;background: radial-gradient(circle, rgba(174,238,236,1) 63%, rgba(239,248,249,1) 100%);">
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); width: 100%; flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
  <h1 style="flex-shrink: 0; align-self: center;">Nombre del producto</h1>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center; height: 100%; padding: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; margin: var(--lumo-space-m); height: 100%;">
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); width: 50%;">
    <img style="width: 100%; padding: var(--lumo-space-m); flex-shrink: 1; flex-grow: 0; margin: var(--lumo-space-m); align-self: center; height: 100%;">
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); width: 50%;">
    <vaadin-vertical-layout theme="spacing">
     <vaadin-vertical-layout theme="spacing" style="width: 100%;">
      <h4 style="font-weight: bold;">Descripción del producto</h4>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="width: 100%; margin: var(--lumo-space-m); align-self: center; align-items: center; justify-content: center; flex-shrink: 0;">
      <vaadin-text-area style="margin: var(--lumo-space-m); width: 100%; height: 100%; flex-shrink: 0; align-self: center;"></vaadin-text-area>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing">
      <vaadin-horizontal-layout theme="spacing">
       <vaadin-horizontal-layout theme="spacing">
        <label style="width: 100%; margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;font-weight: bold;">Precio</label>
       </vaadin-horizontal-layout>
       <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); align-self: center; flex-shrink: 0; align-items: center; justify-content: center;">
        <vaadin-text-field></vaadin-text-field>
       </vaadin-horizontal-layout>
      </vaadin-horizontal-layout>
     </vaadin-vertical-layout>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; margin: var(--lumo-space-m); justify-content: center; flex-shrink: 0; align-self: center; align-items: center; height: 100%; flex-grow: 0;">
  <vaadin-horizontal-layout theme="spacing" style="justify-content: center; align-self: center; flex-shrink: 0; align-items: center; height: 100%; margin: var(--lumo-space-m);">
   <vaadin-horizontal-layout theme="spacing" style="align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m); flex-shrink: 0; width: 100%; height: 100%;">
    <img style="width: 100%; height: 100%; margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;">
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="align-items: center; justify-content: center; align-self: center; flex-shrink: 0; margin: var(--lumo-space-m); width: 100%; height: 100%;">
    <img style="width: 100%; height: 100%; align-self: center; flex-shrink: 0; margin: var(--lumo-space-m);">
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m); width: 100%; height: 100%;">
    <img style="width: 100%; height: 100%; margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;">
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m); width: 100%; height: 100%;">
    <img style="flex-shrink: 0; align-self: center; width: 100%; height: 100%; margin: var(--lumo-space-m);">
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; width: 100%; align-items: center; justify-content: center; align-self: center;">
  <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m); width: 100%;">
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
    <label style="width: 100%; margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;font-weight: bold;">Valoración medía</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);">
    <vaadin-text-field style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; width: 100%;"></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-caracteristicas-del-producto-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCaracteristicasDelProductoAdmin.is, VistaCaracteristicasDelProductoAdmin);
