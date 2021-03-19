import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaAdministrarCategorias extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayoutAdministrarCategorias">
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m); align-items: center; justify-content: center;">
  <h1 style="margin: var(--lumo-space-m); align-self: center;">Administrar categorias</h1>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-shrink: 0; margin: var(--lumo-space-xl);">
  <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-shrink: 0;">
   <h4 style="align-self: center; flex-shrink: 0;">Dar de alta categoría</h4>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
     <label>Nombre de categoría</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
     <vaadin-text-field style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-shrink: 0; align-items: center; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-button style="align-self: center; flex-shrink: 0;" theme="primary">
       Cancelar 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-button style="flex-shrink: 0; align-self: center;" theme="primary">
       Aceptar 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-xl); align-self: center; flex-shrink: 0; align-items: center; justify-content: center;">
  <vaadin-vertical-layout theme="spacing">
   <h4 style="flex-shrink: 0; align-self: center;">Dar de baja categoría</h4>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-shrink: 0; align-items: center; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" style="align-items: center; align-self: center; flex-shrink: 0; justify-content: center; margin: var(--lumo-space-m);">
    <vaadin-horizontal-layout theme="spacing" style="align-items: center; justify-content: center; align-self: center; flex-shrink: 0; margin: var(--lumo-space-m);">
     <label style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);">Categoría</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
     <vaadin-combo-box style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);"></vaadin-combo-box>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); align-self: center; flex-shrink: 0; align-items: center; justify-content: center;">
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); align-self: center; flex-shrink: 0; align-items: center; justify-content: center;">
     <vaadin-button style="flex-shrink: 0; align-self: center;" theme="primary">
       Cancelar 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); align-items: center; align-self: center; flex-shrink: 0; justify-content: center;">
     <vaadin-button style="flex-shrink: 0; align-self: center;" theme="primary">
       Aceptar 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-administrar-categorias';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrarCategorias.is, VistaAdministrarCategorias);
