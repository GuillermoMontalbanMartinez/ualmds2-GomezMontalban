import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-modificar-datos-personales`
 *
 * VistaModificarDatosPersonales element.
 *
 * @customElement
 * @polymer
 */
class VistaModificarDatosPersonales extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-modificar-datos-personales';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaModificarDatosPersonales.is, VistaModificarDatosPersonales);
