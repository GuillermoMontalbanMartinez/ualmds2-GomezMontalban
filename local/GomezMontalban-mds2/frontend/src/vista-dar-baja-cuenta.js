import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaDarBajaCuenta extends PolymerElement {

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
 <h1 style="align-self: center; margin-bottom: var(--lumo-space-m); margin: var(--lumo-space-xl);">Dar de baja cuenta de usuario</h1>
 <vaadin-vertical-layout theme="spacing" style="align-items: center; align-self: center; flex-shrink: 0; justify-content: center; margin-bottom: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="spacing" style="align-self: center; align-items: center; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m);">
    <label style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);">Correo</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m);">
    <vaadin-text-field style="flex-shrink: 0;align-self: center; margin: var(--lumo-space-m);"></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; justify-content: center; align-self: center; flex-shrink: 0; margin: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="spacing" style="align-self: center; align-items: center; justify-content: center; flex-shrink: 0;">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-button style="flex-shrink: 0; align-self: center;" theme="primary">
     Cancelar
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-button theme="primary">
     Aceptar
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-dar-baja-cuenta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaDarBajaCuenta.is, VistaDarBajaCuenta);
