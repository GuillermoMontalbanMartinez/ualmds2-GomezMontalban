import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

class VistaProductoAdmin extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; " id="vistaProductoAdmin">
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center; height: 100%; width: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; height: 100%; margin: var(--lumo-space-m);">
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; border:1px solid black; width: 100%; margin: var(--lumo-space-m); height: 200px;">
    <img style="flex-shrink: 0; align-self: center; width: 100%; height: 100%;">
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center; width: 50%; height: 100%;">
    <vaadin-vertical-layout theme="spacing">
     <vaadin-vertical-layout theme="spacing" style="align-items: center; justify-content: center; width: 100%; margin: var(--lumo-space-m); flex-shrink: 0; height: 100%;">
      <label style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; width: 100%; height: 100%;">Nombre</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; margin: var(--lumo-space-m); flex-shrink: 0; align-items: center; justify-content: center;">
      <vaadin-text-area style="width: 100%; height: 100%; flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);"></vaadin-text-area>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); align-self: center; align-items: center; justify-content: center; width: 100%; height: 100%;">
      <vaadin-text-area style="width: 50%; height: 100%; flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);"></vaadin-text-area>
     </vaadin-vertical-layout>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-producto-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductoAdmin.is, VistaProductoAdmin);
