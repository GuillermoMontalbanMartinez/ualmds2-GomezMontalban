import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-ofertas`
 *
 * VistaOfertas element.
 *
 * @customElement
 * @polymer
 */
class VistaOfertas extends PolymerElement {

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
        return 'vista-ofertas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaOfertas.is, VistaOfertas);
